// time: o(n)
// space: o(n)
func removeKdigits(num string, k int) string {
    if k >= len(num) {return "0"}
    
    st := []byte{}
    for i := 0; i < len(num); i++ {
        n := num[i]
        for len(st) != 0 && n < st[len(st)-1] && k != 0 {
            st = st[:len(st)-1]
            k--
        }
        // a number is not valid if it starts 0
        if len(st) == 0 && n == '0' {continue}
        st = append(st, n)
    }
    for (k != 0 && len(st) != 0) {
        st = st[:len(st)-1]
        k--
    }

    // in case our stack is empty ( happens when 0 removed all elements from st and we do not push 0 into st)
    if len(st) == 0 {return "0"}

    out := new(strings.Builder)
    for i := 0; i < len(st); i++ {
        out.WriteByte(st[i])
    }
    return out.String()
}

// brute force, try forming all possible numbers
func removeKdigits(num string, k int) string {
    ans := "zzzzzzz"
    var dfs func(path string, start, tmpk int) 
    dfs = func(path string, start, tmpk int) {
        // base
        if tmpk == 0 {
            // remove all preceeding zeros as they do not count as part of k removals
            for len(path) >= 1 && path[0] == '0' {path = path[1:]}
             // have to do this because for some reason 1200 < 200 , therefore this hack
            if len(path) > len(ans) {return}
            if strings.Compare(path, ans) == -1 {
                ans = path
            }
            return
        }
        
        // logic
        for i := start; i < len(path); i++ {
            newPath := string(path[:i])+string(path[i+1:])
            dfs(newPath, i, tmpk-1)
        }
    } 
    dfs(num, 0, k)
    if ans == "" {ans = "0"}
    return ans
}
