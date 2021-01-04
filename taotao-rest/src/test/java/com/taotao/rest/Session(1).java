package com.taotao.rest;

class Session {
//
//    private final OkHttpClient mOkHttpClient = new OkHttpClient.Builder().cookieJar(new CookieJarManager()).build();
//    private String csrfTokden = null;
//    private String sessionid = null;
//    //�?�? //如果直接写个类，里面写saveFromResponse和loadForRequest，�?�不实现CookieJar接口，运行可以正常�?�过，但ide会显红，因为Bulider类的cookieJsr方法�?要接受CookieJar类型的实例�?�鸭子类除了能节约代码行数，在可理解�? 可读�? 多人合作性上面都不如接口规范，谁知道鸭子类里面要写什么方法，除了写代码得人自己�??
//    private class CookieJarManager implements CookieJar{
//        private final HashMap<String, List<Cookie>> cookieStore = new HashMap<>();
//
//        @Override
//        public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
//            cookieStore.put(url.host(), cookies);
//            if(cookies!=null) {
//            	for(Cookie c : cookies) {
//            		if("csrftoken".equals(c.name())){
//            			csrfTokden = c.value();
//            			break;
//                    }
//            	}
//            	for(Cookie c : cookies) {
//            		if("sessionid".equals(c.name())){
//            			sessionid = c.value();
//            			break;
//                    }
//            	}
//            }
//        }
//
//        @Override
//        public List<Cookie> loadForRequest(HttpUrl url) {
//            List<Cookie> cookies = cookieStore.get(url.host());
//            return cookies != null ? cookies : new ArrayList<Cookie>(){};
//        }
//    }
//
//    /**
//     * @param url  要请求的url
//     * @param  paramsMap post的请求参�?
//     * @return  post的返回结�?
//     */
//    public String post(String url, HashMap<String, String > paramsMap){
//
//        FormBody.Builder formBodyBuilder = new FormBody.Builder();
//        Set<String> keySet = paramsMap.keySet();
//        for(String key:keySet) {
//            String value = paramsMap.get(key);
//            formBodyBuilder.add(key,value);
//        }
//        FormBody formBody = formBodyBuilder.build();
//        Request request = new Request
//                .Builder()
//                .post(formBody)
//                .url(url)
//                .build();
//        try (Response response = mOkHttpClient.newCall(request).execute()) {
//            String  respStr = response.body().string();
//
//            return respStr;
//        }catch (Exception e){
//
//            e.printStackTrace();
//            return "";
//        }
//    }
//
//    public String get(String url)  {
//        final Request.Builder builder = new Request.Builder();
//        builder.url(url);
//        final Request request = builder.build();
//        try (Response response = mOkHttpClient.newCall(request).execute()) {
//            return response.body().string();
//        }catch (Exception e){
//            e.printStackTrace();
//            return "";
//        }
//    }
//
//    public String getCSRFftoken() {
//    	return csrfTokden;
//    }
//
//
//
//    public String getSessionid() {
//		return sessionid;
//	}
//
//	public static void test(){
//
//    	 RequestConfig globalConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD).build();
//         // 创建cookie store的本地实例
//         CookieStore cookieStore = new BasicCookieStore();
//         // 创建HttpClient上下文
//         HttpClientContext context = HttpClientContext.create();
//         context.setCookieStore(cookieStore);
//
//         // 创建一个HttpClient
//         CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(globalConfig)
//                 .setDefaultCookieStore(cookieStore).build();
//         String cookie ="";
//        Session ss=new Session();
//        String res=ss.get("http://10.8.199.104:28426/admin/login/");
////        System.out.println("111111111"+res);
//
//
//
//        //System.out.println(res);
//
//      /*  for (org.apache.http.cookie.Cookie c : cookieStore.getCookies()) {
//            if("csrftoken".equals(c.getName())){
//                cookie = c.getValue();
//            }
//        }*/
//        System.out.println("登陆页面,cookie:"+ss.getCSRFftoken());
//
//        HashMap<String,String> paramsMap = new HashMap<>() ;
//        paramsMap.put("username","yuguosheng-phq");
//        paramsMap.put("password","Tp6qeG841");
//        paramsMap.put("csrfmiddlewaretoken",ss.getCSRFftoken());
//        String respStr = ss.post("http://10.8.199.104:28426/admin/login/",paramsMap);
//
//        System.out.println(ss.getCSRFftoken());
//        System.out.println(ss.getSessionid());
////        res.close();
//
//    }
//
//
//
//   public static void main(String[] args) {
//
//
//        test();
//
//        System.out.println("1111111111111");
//
//    }

}