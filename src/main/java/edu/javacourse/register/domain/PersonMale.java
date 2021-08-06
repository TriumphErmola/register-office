package edu.javacourse.register.domain;

import java.util.List;

public class PersonMale extends Person {

    private List<MarriageCertificate> marriageCertificates;
    private List<BirthCertificate> birthCertificatesCertificates;

    public List<MarriageCertificate> getMarriageCertificates() {
        return marriageCertificates;
    }

    public void setMarriageCertificates(List<MarriageCertificate> marriageCertificates) {
        this.marriageCertificates = marriageCertificates;
    }

    public List<BirthCertificate> getBirthCertificatesCertificates() {
        return birthCertificatesCertificates;
    }

    public void setBirthCertificatesCertificates(List<BirthCertificate> birthCertificatesCertificates) {
        this.birthCertificatesCertificates = birthCertificatesCertificates;
    }
}
