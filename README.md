# Traffic Light Density Simulation 🚦

Trafik yoğunluğuna duyarlı kavşak sinyalizasyonu üzerine bir **üniversite dönem projesi** (Erciyes Üniversitesi, Görsel Programlama dersi). Sabit süreli trafik ışıkları yerine, her yöndeki araç sayısına orantılı yeşil süre atamayı simüle etmeyi amaçlar.

> **Durum:** Proje eğitim amaçlıdır ve arayüz entegrasyonu tamamlanmamıştır. Süre hesaplama ve döngü mantığı yazılmış durumdadır; arayüz iskeleti mevcuttur ancak ikisi henüz birbirine bağlı değildir. Ayrıntı aşağıda.

## Ne yapıyor

- **Orantılı süre hesabı** — `TrafficController`, 120 saniyelik toplam döngüden sarı süreleri düşerek kalan yeşil süreyi dört yöne araç sayısıyla orantılı dağıtır
- **Yön döngüsü** — `CycleManager` Kuzey → Doğu → Güney → Batı sırasını yönetir
- **İki mod** — otomatik (rastgele 0–29 araç) ve manuel (kullanıcı girişi), `SimulationManager` üzerinden
- **JavaFX arayüz iskeleti** — FXML ile çizilmiş kavşak, dört yönde ışık daireleri, sayaç etiketleri ve kontrol butonları

## Tamamlanan / eksik

| Bileşen | Durum |
|---|---|
| Süre hesaplama mantığı (`brain/`) | ✅ Yazıldı |
| Yön döngüsü | ✅ Yazıldı |
| FXML arayüz yerleşimi | ✅ Yazıldı |
| Arayüz ↔ mantık bağlantısı | ❌ Yapılmadı — buton işleyicileri henüz simülasyonu başlatmıyor |
| Sayaç göstergesi ve araç animasyonu | ❌ Sınıflar boş |
| Araç sınıf hiyerarşisi (`Car`/`Bus`/`Truck`) | ⚠️ Tanımlı, simülasyonda kullanılmıyor |
| Testler | ❌ Yok |

## Teknolojiler

Java 21 · JavaFX 21 · FXML (SceneBuilder) · Maven

## İnceleme

Projeyi IDE ile açıp `TrafficSimApp` sınıfından başlatabilirsiniz; mevcut durumda arayüz açılır ancak simülasyon butonlara bağlı değildir. Mantık katmanı `brain/` paketinden bağımsız olarak okunabilir.

```
src/main/java/com/erciyes/edu/tr/trafficlightdensity/
├── TrafficSimApp.java     Giriş noktası
├── brain/                 TrafficController, CycleManager, SimulationManager
├── intersection_gui/      Arayüz denetleyicisi (entegrasyon eksik)
└── road_objects/          Vehicle, TrafficLight, Direction, LightPhase
```

## Lisans

MIT — katkıda bulunanlar: [vedattatli](https://github.com/vedattatli), [farukemresenturk1](https://github.com/farukemresenturk1)
