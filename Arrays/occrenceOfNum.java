 ArrayList<Long> find(long arr[], int n, int x)
    {
       ArrayList<Long> li = new ArrayList<>();
        long i = -1;
        long j = -1;

        for (int k = 0; k < n; k++) {
            if (arr[k] == x) {
                if (i == -1) {
                    i = k;
                }
                j = k;
            }
        }

        li.add(i);
        li.add(j);
        return li;
    }
