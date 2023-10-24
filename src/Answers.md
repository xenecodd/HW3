Yazılım geliştirme alanında yaygın olarak bilinen hata 
türleri vardır. Bunlar; fonksiyonel hatalar, söz dizimi 
(syntax) hataları, run-time (çalışma zamanı) hataları ve 
mantık hatalarıdır.

1. Fonksiyonel Hatalar
   Yazılım istendiği gibi çalışmadığı durumda meydana gelen geniş kapsamlı bir hata türüdür. Örneğin, bir kullanıcı bir metin editöründe çalışma yapıp bir şeyler yazdıktan sonra “Kaydet” butonuna tıklarsa ve çalışması kaydedilmezse, bu fonksiyonel bir hata olur.
2. Söz dizimi (Syntax) Hataları
   Söz dizimi hataları, yazılım gelişt2irme esnasında yazmış olduğunuz kodlarda yaptığınız yazım hatalarıdır. Eğer gelişmiş bir kod editörü kullanıyorsanız örneğin visual studio code, bir söz dizimi (syntax) hatası yaptığınız zaman editör sizi uyarır. En yaygın hata türü olan söz dizimi hatalarını, henüz yazılım geliştirme aşamasında oluştuğu anda kolayca görüp düzeltebilirsiniz. 
3. Run-Time (Çalışma Zamanı) Hataları
   Run-time (Çalışma Zamanı) hataları ise, yazmış olduğunuz kodu derleyip çalıştırdıktan sonra ortaya çıkan hatalardır. Bu hata türü bir söz dizimi (syntax) hatası olmasa bile her şey normal görünüyorken programın çalıştırma esnasında hata vermesiyle oluşur. 
4. Mantık Hataları
   Mantık hatası, bir yazılımın çalışma akışındaki hatayı temsil eder. Yazılımın yanlış davranmasına neden olur. Bu tür bir hata, programın yanlış bir çıktı vermesine, askıda kalmasına veya programın çökmesine neden olabilir.
Söz dizimi hatalarından farklı olarak mantık hatalarında program derlenir ama düzgün çalışmaz. Mantık hatasına örnek olarak bir kod dizisinin sürekli olarak çalıştığı sonsuz döngü örnek verilebilir.

En az hata ile kod yazmak için ne yapmalı?

1. Basit olmalı, basit yazmalı ve basit okumalısınız.
2. Sizden sonra kod ile uğraşacak kişiler için daha sade bir ortam bırakmalısınız.
3. Hatalardan ve eksiklerden arındırmalısınız. Hatasız çalışıyor olması, onun kötü kod, yani bad code olduğu gerçeğini değiştirmez.
4. Karmaşık kodlar ile okunabilirliği düşürmeyin. Daha basit kod stilleri deneyin.
5. Polymorphism kullanarak pek çok farklı yapı ile esneklik kurmalısınız.
6. Dependency İnjection (Bağımlılık Enjeksiyonu) kullanmaya özen gösterin. Böylece kod tüm bağımlılıklardan kurtulur, bağımsız bir şekilde düzenlenebilir.
7. Kullandığınız değişken, function/method, class isimleri net ve açıklayıcı olması gerekir. Buna özen göstermelisiniz.
8. Adlandırmaları doğru yapmalısınız. Daha sonra kolay arama yapılabilmesi çok önemlidir.
9. Kullandığınız fonksiyonlar birden fazla işlem yapmamalı. Sadece kendi işini yapan fonksiyonlar kodlamalısınız.
10. Side Effect (Yan Etki) içeren fonksiyonlardan kaçınmalısınız.
11. Gereği olmayan yorum satırları kullanmamalısınız ve yorum satırlarınız açıklayıcı olmalı.
12. Fonksiyonların akış yönü aşağı doğru olmalı ve girintileri bozmamalıdır.
13. Statik olmayan yöntemleri kullanmaya özen gösterin.