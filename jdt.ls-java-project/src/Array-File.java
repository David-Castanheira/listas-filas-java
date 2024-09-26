private static List<Data> readFile(String filePath){
        File arq = new File(filePath);

        List<Data> dataList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";
            while ((linha = bufferedReader.readLine()) != null) {
                String[] split = linha.split(":");
                dataList.add(new Data(getClientType(split), getNPassengers(split), parseDates(split)));
            }

            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataList;
    }

    private static String getClientType(String[] split){
        if (split == null || split.length == 0){
            return null;
        }

        return split[0];
    }