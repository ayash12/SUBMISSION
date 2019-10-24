package com.coolman.submission;

import java.util.ArrayList;

public class CeoData {
    private static String[] ceoNames = {
            "Nadiem Makarim",
            "Wiliam Tanuwijaya",
            "Ferry Unardi",
            "Achmad Zaky",
            "Kusumo Martanto",
            "Hadi Wenas",
            "Florian Holm",
            "Chris Feng",
            "Antony Fung",
            "Zhang Li",
            "Narenda Wicaksono"
    };
    private static String[] ceoDetails = {
            "CEO Gojek",
            "CEO Tokopedia",
            "CEO Traveloka",
            "CEO Bukalapak",
            "CEO Blibli",
            "CEO MatahariMall",
            "co-CEO Lazada Indonesia",
            "CEO Shopee",
            "CEO Zalora",
            "CEO Jd.id",
            "CEO Dicoding"

    };

    private static String[] ceoCekDetails = {
            "Nadiem Makarim atau yang lebih dikenal dengan panggilan Nadiem lahir di Jakarta 4 Juli 1984 dari pasangan Nono Anwar Makarim dan Atika Algadrie. Ia adalah anak lelaki satu satunya dari pengacara ternama keturunan Arab asal Pekalongan, Jawa Tengah, Nono Anwar Makarim. Ayahnya seorang intelektual dan lawyer dengan gelar Doktor ilmu hukum lulusan Harvard.\nSumber : viva.co.id",
            "William Tanuwijaya lahir di Pematangsiantar, Sumatera Utara, 11 November 1981. Ia mengenyam pendidikan sekolah dasar hingga menengah di kampung halamannya. Ia baru meninggalkan tempat kelahirannya saat meneruskan kuliah di Jakarta.\nSumber : viva.co.id",
            "Ferry Unardi Pria kelahiran Kota Padang, 16 Januari 1988 ini merupakan lulusan Computer Science and Engineering di Purdue University dengan gelar Bachelor Science. Setelah menyelesaikan studi strata pertamanya, Ferry sempat bekerja sebagai Software Engineer di Microsoft, Seattle, Amerika Serikat (AS), selama kurang lebih 3 tahun.\nSumber : viva.co.id",
            "Acmad Zaky Pria kelahiran  Sragen, 24 Agustus 1986 ini, ternyata sejak SD sudah menaruh minat di dunia Komputer. Sang ayah sering membelikannya komputer dan juga buku-buku untuk pemrograman. Hal itulah yang kemudian ia ingat dan praktikan hingga menjadi pengusaha.\nSumber : viva.co.id",
            "Kusumo Martanto, Ia merupakan seorang yang lulusan S-2 teknik industri dan Georgia Institute of Teknology di Amerika Serikat. Untuk saat ini ia menjadi bagian dari CEO di PT. Global Digital Niaga. Setelah ia lulus dari SMA di tahun 1992, Kusumo Martanto langsung melanjutkan pendidikannya di Amerika Serikat.\nSumber : satujam.com",
            "Hadi Wenas merupakan salah satu anak muda di Indonesia yang memilih jalan karir sesuai dengan passion-nya. Pria yang akrab disapa dengan panggilan Hadi ini menyelesaikan studi S1 di bidang menchanical engineering di University of Wisconsin Madison. Usai menyelesaikan jenjang studi S1-nya, Hadi sempat bekerja di Oracle sambil melanjutkan S2 ilmu komputer di Stanford University.\nSumber : maxmanroe.com",
            "Florian Holm Setelah lulus dari Heidelberg University di Jerman, ia mengawali karir dengan bergabung di Boston Consulting Group di Swiss selama tiga tahun. Kemudian pada tahun 2014, ia bergabung di Lazada sebagai Head of Vendor Management di Thailand, setelah itu ditunjuk menjadi Chief Marketing Officer di Filipina.\nSumber : techinasia.com",
            "Chris Feng, pria lulusan terbaik dari Universitas Nasional Singapura yang memungkinkan para penggunanya membeli atau menjual barang melalui aplikasi yang tersedia di platform iOS dan Android.Chris Feng adalah Chief Executive Officer Shopee. Chris memiliki rekam jejak yang mapan di sektor e-commerce, media, dan teknologi. Sebelum fokus penuh di Shopee, Chris memulai dan mengelola divisi bisnis game seluler Garena selama sekitar 2 tahun \nSumber : arinseptyan.blogspot.com",
            "Anthony sendiri memulai karir pada Agustus 2012 hingga April 2013 di Zalora sebagai managing director Zalora Taiwan. Dari Taiwan, Anthony kemudian dipindahkan ke Zolora Indonesia dengan posisi yang sama. Dari pengalamannya bertahun-tahun inilah kemudian Anthony dipercaya oleh manajemen Zalora untuk menjadi Chief Executive Officer (CEO) Zalora Indonesia sejak 1 September 2015 silam dengan menggantikan posisi menggantikan Fredrik Thomassen \nSumber : maxmanroe.com",
            "Zhang Li merupakan aktor di balik cepatnya pertumbuhan JD.ID dalam kurun waktu 1 tahun dari masa peluncurannya. Tercatat pertumbuhan bisnisnya naik sebanyak 30%-50% di setiap bulannya. Sebelumnya dia juga berhasil membawa JD.com menembus peringkat pertama untuk kategori PC dan makanan-minumam di ranah industri e-commerce. Sumber : swa.co.id",
            "Narenda Wicaksono, sosok muda berbakat di dunia teknologi informasi. Geliatnya terlihat sejak ia duduk di bangku kuliah jurusan informatika ITB. Tak hanya pandai dalam bidang akademis, pria yang akrab disapa Naren ini juga pandai berorganisasi. Tercatat ia pernah menjabat sebagai Ketua Himpunan Informatika ITB dan Microsoft Students Partners. Di bidang akademis, ia juga beberapa kali menyumbangkan penghargaan bergengsi seperti Imagine Cup 2006, LCEN 2006, dan Lomba Riset ITB 2006.\nSumber : merdeka.com"

    };

    private static int[] ceoImages = {
            R.drawable.nadiem,
            R.drawable.william,
            R.drawable.ferry,
            R.drawable.achmad,
            R.drawable.kusumo,
            R.drawable.hadi,
            R.drawable.florian,
            R.drawable.chris,
            R.drawable.anthony,
            R.drawable.zhang,
            R.drawable.narenda
    };

    static ArrayList<Ceo> getListData(){
        ArrayList<Ceo> list = new ArrayList<>();
        for (int position = 0; position < ceoNames.length; position++){
            Ceo ceo = new Ceo();
            ceo.setName(ceoNames[position]);
            ceo.setDetail(ceoDetails[position]);
            ceo.setCekdetail(ceoCekDetails[position]);
            ceo.setPhoto(ceoImages[position]);
            list.add(ceo);

        }
        return list;
    }
}
