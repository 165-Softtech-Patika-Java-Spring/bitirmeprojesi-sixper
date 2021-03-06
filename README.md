
# CONSTRAINTS

username and password must be alpha numerical <br>
username length must be 3-20 long <br>
password length must be 7-30 long <br>
name and surname fields can be empty but maximum length is 30 <br>

# EXCEPTIONS

All exceptions defined and handled in gen package. Exceptions encapsulated in a generic response form.

# RESPONSE

There is a RestResponse model. Succes or fail all responses encapsulated with RestResponse model which is defined in gen package

# API Documentation

Swagger preferred

# End Points

There are 2 entities User and Product. Update,get,delete,post can be performed either <br>

All other endpoints which is required by project are implemented.

![](src/img/1.png)





# Bitirme Projesi

Projenin Konusu:
Bir marketteki ürünlerin satış fiyatlarına göre son fiyatlarını belirleyen servisin Spring Boot Framework
kullanılarak yazılması ve isteğe bağlı olarak önyüzünün yazılması.

> **Gereksinimler:**

> **Backend:**

- Kullanıcıdan kullanıcı adı, şifre, isim, soy isim bilgilerini alarak sisteme kayıt yapılır.
- Sisteme kayıtlı kullanıcılar market ürünlerinin veri girişini yapabilir.
- Ürün türlerine göre KDV oranları değişiklik göstermektedir. Bu oranlar aşağıdaki tabloda
belirtilmiştir. __**Zaman zaman KDV oranları değişiklik gösterebilmektedir.**__

![Image](https://www.linkpicture.com/q/Untitled_395.png)


- Ürün için veri girişi yapacak kullanıcı; ürünün adı, ürünün türü ve vergisiz satış fiyatı alanlarını
doldurur. Her bir ürün için KDV Tutarı ve ürünün son fiyatı da hesaplanarak sisteme kaydedilir.
> **Kurallar ve gereksinimler:**
- Sisteme yeni kullanıcı tanımlanabilir, güncellenebilir ve silinebilir.
- Sisteme yeni ürünler tanımlanabilir, güncellenebilir ve silinebilir.
- Ürünlerin fiyatları güncellenebilir.
- KDV oranları değiştiğinde sistemdeki ürünlere de bu değişiklik yansıtılmalıdır. Herhangi bir hata
durumunda tüm işlemler geri alınmalıdır.
- Tüm ürünler listelenebilmelidir.
- Ürün türlerine göre ürünler listelenebilmelidir.
- Belirli bir fiyat aralığındaki ürünler listelenebilmelidir.
- Ürün türlerine göre aşağıdaki gibi detay veri içeren bir bilgilendirme alınabilmelidir.

![Image](https://www.linkpicture.com/q/22_57.png)

> Validasyonlar:
- Aynı kullanıcı adı ile kullanıcı tanımı yapılamaz.
- Kullanıcı girişi kullanıcı adı & şifre kombinasyonu ile yapılır.
- Ürün türü, fiyatı, adı gibi alanlar boş olamaz.
- Ürün fiyatı sıfır ya da negatif olamaz.
- KDV oranı negatif olamaz.
> Authentication:
- Güvenli endpointler kullanınız. (jwt, bearer vs. )
> Response:
- Başarılı ve başarısız responselar için modeller tanımlayın ve bunları kullanın.
> Dökümantasyon:
- Open API Specification (Swagger tercih sebebi)
> Exception Handling:
- Hatalı işlemler için doğru hata kodlarının dönüldüğünden emin olunuz.
> Test:
- Unit ve integration testleri yazınız. 
