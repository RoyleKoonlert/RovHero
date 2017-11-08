package com.royle.rovhero.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by RoyleKoonlert on 30/10/2017 AD.
 */

public class HeroData implements Parcelable {

    /**
     * desc : ข้าเคยเป็นความหวังเพียงหนึ่งเดียวของมนุษยชาติในสงครามแวมไพร์ที่ยาวนานร่วมศตวรรษ" Van Helsing ไม่เคยเชื่อเรื่องแวมไพร์จนกระทั่งเขากลายเป็นนักล่าแวมไพร์ เมื่อเขาเดินทางไปยังโรมาเนียเพื่อรับมรดกจากบรรพบุรุษ Van Helsing ก็ได้ประจันหน้ากับ Dracula การขาดประสบการณ์ในการรับมือกับสัตว์ร้ายแห่งรัตติกาลเหล่านี้ส่งผลให้ภรรยาของเขาต้องจบชีวิตลง เหตุการณ์นี้ได้ทำลายชีวิตของ Van Helsing และตั้งแต่นั้นเป็นต้นมา เขามีแต่ความต้องการที่จะชำระความแค้นของตนต่อเผ่าพันธุ์แวมไพร์ "ข้าขอสาบานในนามของพระเจ้าว่าข้าจะกำจัดอำนาจมืดบนโลกใบนี้ให้หมดสิ้น และจะต่อกรกับแวมไพร์จวบจนลมหายใจสุดท้าย!" คำปฏิญาณนี้คือทุกสิ่งที่ Val Helsing ยึดมั่น เขากลายเป็นบุรุษที่มีเป้าหมายเพียงหนึ่งเดียวคือการล้างเผ่าพันธุ์แวมไพร์ซึ่งเขาก็ทำได้เช่นนั้น ทันใดที่แวมไพร์ตัวสุดท้ายล้มลงแทบเท้าเขา Van Helsing ก็รู้สึกได้ถึงความว่างเปล่า เขาได้ยินเสียงแห่งสวรรค์ว่า "เจ้าได้ทำสิ่งที่ไม่มีมนุษย์ผู้ใดทำได้ แต่ความมืดมิดที่เจ้าได้ต่อสู้นั้นมีอยู่ในรูปแบบมากมาย และแวมไพร์ก็เป็นเพียงรูปหนึ่งเท่านั้น" เสียงเรียกจากบรรพกาลนี้ทำให้ Van Helsing รู้สึกฮึกเหิม เสียงนั้นได้กล่าวต่อไปว่า “ครานี้ เจ้าจะต้องเผชิญกับพลังและความโหดเหี้ยมของปีศาจที่แท้จริง แต่จงอย่าได้กลัว เพราะเจ้าจะกลายเป็นนักล่าปีศาจ!
     * hero_banner : https://firebasestorage.googleapis.com/v0/b/rovhero-f8be7.appspot.com/o/vanhelsing%2Fvanhelsing-banner.jpg?alt=media&token=fa6bdbd3-1ec4-4bbf-a070-0523348a0bf2
     * hero_icon : https://firebasestorage.googleapis.com/v0/b/rovhero-f8be7.appspot.com/o/vanhelsing%2Fvanhelsing.png?alt=media&token=0eae0716-b374-45d5-ab61-220278f6c2e3
     * hero_name : VAN HELSING
     * hero_type : carey
     * skill : {"skill_1":"https://firebasestorage.googleapis.com/v0/b/rovhero-f8be7.appspot.com/o/vanhelsing%2Fvanhelsing-skill-1.png?alt=media&token=ececb100-bbfb-4525-8c2e-bc6248f3eb95","skill_2":"https://firebasestorage.googleapis.com/v0/b/rovhero-f8be7.appspot.com/o/vanhelsing%2Fvanhelsing-skill-2.png?alt=media&token=434b6add-215a-45e7-8af0-16a9076b9fe2","skill_3":"https://firebasestorage.googleapis.com/v0/b/rovhero-f8be7.appspot.com/o/vanhelsing%2Fvanhelsing-skill-3.png?alt=media&token=95f028c8-af6e-44db-bbd3-25c82f56eaa5","skill_4":"https://firebasestorage.googleapis.com/v0/b/rovhero-f8be7.appspot.com/o/vanhelsing%2Fvanhelsing-skill-4.png?alt=media&token=c0148eda-0fb2-4ace-a1a8-e65de012e8b9"}
     * title_desc : เทศกาลล่าปิศาจ เริ่มต้นขึ้นแล้ว
     */

    private String desc;
    @SerializedName("hero_banner")
    private String heroBanner;
    @SerializedName("hero_icon")
    private String heroIcon;
    @SerializedName("hero_name")
    private String heroName;
    @SerializedName("hero_type")
    private String heroType;
    private Skill skill;
    @SerializedName("title_desc")
    private String titleDesc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getHeroBanner() {
        return heroBanner;
    }

    public void setHeroBanner(String heroBanner) {
        this.heroBanner = heroBanner;
    }

    public String getHeroIcon() {
        return heroIcon;
    }

    public void setHeroIcon(String heroIcon) {
        this.heroIcon = heroIcon;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroType() {
        return heroType;
    }

    public void setHeroType(String heroType) {
        this.heroType = heroType;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getTitleDesc() {
        return titleDesc;
    }

    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc;
    }

    public static class Skill implements Parcelable {
        /**
         * skill_1 : https://firebasestorage.googleapis.com/v0/b/rovhero-f8be7.appspot.com/o/vanhelsing%2Fvanhelsing-skill-1.png?alt=media&token=ececb100-bbfb-4525-8c2e-bc6248f3eb95
         * skill_2 : https://firebasestorage.googleapis.com/v0/b/rovhero-f8be7.appspot.com/o/vanhelsing%2Fvanhelsing-skill-2.png?alt=media&token=434b6add-215a-45e7-8af0-16a9076b9fe2
         * skill_3 : https://firebasestorage.googleapis.com/v0/b/rovhero-f8be7.appspot.com/o/vanhelsing%2Fvanhelsing-skill-3.png?alt=media&token=95f028c8-af6e-44db-bbd3-25c82f56eaa5
         * skill_4 : https://firebasestorage.googleapis.com/v0/b/rovhero-f8be7.appspot.com/o/vanhelsing%2Fvanhelsing-skill-4.png?alt=media&token=c0148eda-0fb2-4ace-a1a8-e65de012e8b9
         */

        @SerializedName("skill_1")
        private String skill1;
        @SerializedName("skill_2")
        private String skill2;
        @SerializedName("skill_3")
        private String skill3;
        @SerializedName("skill_4")
        private String skill4;

        public String getSkill1() {
            return skill1;
        }

        public void setSkill1(String skill1) {
            this.skill1 = skill1;
        }

        public String getSkill2() {
            return skill2;
        }

        public void setSkill2(String skill2) {
            this.skill2 = skill2;
        }

        public String getSkill3() {
            return skill3;
        }

        public void setSkill3(String skill3) {
            this.skill3 = skill3;
        }

        public String getSkill4() {
            return skill4;
        }

        public void setSkill4(String skill4) {
            this.skill4 = skill4;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.skill1);
            dest.writeString(this.skill2);
            dest.writeString(this.skill3);
            dest.writeString(this.skill4);
        }

        public Skill() {
        }

        protected Skill(Parcel in) {
            this.skill1 = in.readString();
            this.skill2 = in.readString();
            this.skill3 = in.readString();
            this.skill4 = in.readString();
        }

        public static final Parcelable.Creator<Skill> CREATOR = new Parcelable.Creator<Skill>() {
            @Override
            public Skill createFromParcel(Parcel source) {
                return new Skill(source);
            }

            @Override
            public Skill[] newArray(int size) {
                return new Skill[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.desc);
        dest.writeString(this.heroBanner);
        dest.writeString(this.heroIcon);
        dest.writeString(this.heroName);
        dest.writeString(this.heroType);
        dest.writeParcelable(this.skill, flags);
        dest.writeString(this.titleDesc);
    }

    public HeroData() {
    }

    protected HeroData(Parcel in) {
        this.desc = in.readString();
        this.heroBanner = in.readString();
        this.heroIcon = in.readString();
        this.heroName = in.readString();
        this.heroType = in.readString();
        this.skill = in.readParcelable(Skill.class.getClassLoader());
        this.titleDesc = in.readString();
    }

    public static final Parcelable.Creator<HeroData> CREATOR = new Parcelable.Creator<HeroData>() {
        @Override
        public HeroData createFromParcel(Parcel source) {
            return new HeroData(source);
        }

        @Override
        public HeroData[] newArray(int size) {
            return new HeroData[size];
        }
    };
}
