package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_BAG_DATAS")
public class BagData {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "AIRPORT_CODE", length = 3)
    private String airportCode;

    @Column(name = "INBOUND_FLIGHT_AIRLINE", length = 3)
    private String inboundFlightAirline;

    @Column(name = "INBOUND_FLIGHT_NUMBER", length = 5)
    private String inboundFlightNumber;

    @Column(name = "INBOUND_FLIGHT_SDD")
    private Instant inboundFlightSdd;

    @Column(name = "INBOUND_FLIGHT_SDA")
    private Instant inboundFlightSda;

    @Column(name = "INBOUND_FLIGHT_CLASS", length = 1)
    private String inboundFlightClass;

    @Column(name = "INBOUND_FLIGHT_AIRPORT", length = 3)
    private String inboundFlightAirport;

    @Column(name = "OUTBOUND_FLIGHT_AIRLINE", length = 3)
    private String outboundFlightAirline;

    @Column(name = "OUTBOUND_FLIGHT_NUMBER", length = 5)
    private String outboundFlightNumber;

    @Column(name = "OUTBOUND_FLIGHT_SDD")
    private Instant outboundFlightSdd;

    @Column(name = "OUTBOUND_FLIGHT_CLASS", length = 1)
    private String outboundFlightClass;

    @Column(name = "OUTBOUND_FLIGHT_AIRPORT", length = 3)
    private String outboundFlightAirport;

    @Column(name = "ONWARD_AIRLINE", length = 3)
    private String onwardAirline;

    @Column(name = "ONWARD_FLIGHT_NUMBER", length = 5)
    private String onwardFlightNumber;

    @Column(name = "ONWARD_SDD")
    private Instant onwardSdd;

    @Column(name = "ONWARD_CLASS", length = 1)
    private String onwardClass;

    @Column(name = "ONWARD_AIRPORT", length = 3)
    private String onwardAirport;

    @Column(name = "IND_ATL")
    private Long indAtl;

    @Column(name = "IND_CREW", nullable = false)
    private Long indCrew;

    @Column(name = "SEAT_NUMBER", length = 3)
    private String seatNumber;

    @Column(name = "PASSENGER_STATUS", length = 1)
    private String passengerStatus;

    @Column(name = "CHECKIN_SEQUENCE_NUMBER", length = 3)
    private String checkinSequenceNumber;

    @Column(name = "BAGGAGE_STATUS", length = 1)
    private String baggageStatus;

    @Column(name = "FLIGHT_HANDLING_AREA", length = 2)
    private String flightHandlingArea;

    @Column(name = "PASSENGER_NAME", length = 61)
    private String passengerName;

    @Column(name = "PASSENGER_SURNAME", length = 61)
    private String passengerSurname;

    @Column(name = "PASSENGER_GIVEN_NAME", length = 61)
    private String passengerGivenName;

    @Column(name = "PASSENGER_NO_SURNAME", length = 2)
    private String passengerNoSurname;

    @Column(name = "FREQUENT_TRAVELLER_NUMBER", length = 25)
    private String frequentTravellerNumber;

    @Column(name = "FREQUENT_TRAVELLER_TIER", length = 25)
    private String frequentTravellerTier;

    @Column(name = "CORPORATE_OR_GROUPNAME", length = 16)
    private String corporateOrGroupname;

    @Column(name = "PNR_ADDRESS", length = 6)
    private String pnrAddress;

    @Column(name = "INTERNAL_AIRLINE_DATA", length = 59)
    private String internalAirlineData;

    @Column(name = "RECOGNITION_STATE", length = 15)
    private String recognitionState;

    @Column(name = "IDENTIFICATION_STATE", length = 35)
    private String identificationState;

    @Column(name = "MANUAL_ID_TASK", length = 20)
    private String manualIdTask;

    @Column(name = "QUALIFICATION_STATE", length = 30)
    private String qualificationState;

    @Column(name = "OPERATIONAL_CONTROL_ACTION", length = 40)
    private String operationalControlAction;

    @Column(name = "LAST_OPERATIONAL_CTRL_MSG", length = 59)
    private String lastOperationalCtrlMsg;

    @Column(name = "TIMELINESS", length = 8)
    private String timeliness;

    @Column(name = "AIRLINE", length = 3)
    private String airline;

    @Column(name = "PHYSICAL_CLASS", length = 2)
    private String physicalClass;

    @Column(name = "IND_SYSTEM_ATL")
    private Long indSystemAtl;

    @Column(name = "OHD_BRAND_NAME", length = 30)
    private String ohdBrandName;

    @Column(name = "OHD_COLOUR", length = 2)
    private String ohdColour;

    @Column(name = "OHD_FREQUENT_TRAVELLER_NUMBER", length = 25)
    private String ohdFrequentTravellerNumber;

    @Column(name = "OHD_FREQUENT_TRAVELLER_TIER", length = 25)
    private String ohdFrequentTravellerTier;

    @Column(name = "OHD_LPN", length = 10)
    private String ohdLpn;

    @Column(name = "OHD_MATERIAL", length = 30)
    private String ohdMaterial;

    @Column(name = "OHD_PASSENGER_ADDRESS", length = 106)
    private String ohdPassengerAddress;

    @Column(name = "OHD_PASSENGER_GIVEN_NAME1", length = 61)
    private String ohdPassengerGivenName1;

    @Column(name = "OHD_PASSENGER_GIVEN_NAME2", length = 61)
    private String ohdPassengerGivenName2;

    @Column(name = "OHD_PASSENGER_GIVEN_NAME3", length = 61)
    private String ohdPassengerGivenName3;

    @Column(name = "OHD_PASSENGER_SURNAME1", length = 61)
    private String ohdPassengerSurname1;

    @Column(name = "OHD_PASSENGER_SURNAME2", length = 61)
    private String ohdPassengerSurname2;

    @Column(name = "OHD_PASSENGER_SURNAME3", length = 61)
    private String ohdPassengerSurname3;

    @Column(name = "OHD_ROUTING1", length = 3)
    private String ohdRouting1;

    @Column(name = "OHD_ROUTING2", length = 3)
    private String ohdRouting2;

    @Column(name = "OHD_ROUTING3", length = 3)
    private String ohdRouting3;

    @Column(name = "OHD_ROUTING4", length = 3)
    private String ohdRouting4;

    @Column(name = "OHD_ROUTING5", length = 3)
    private String ohdRouting5;

    @Column(name = "OHD_TYPE_CODE", length = 5)
    private String ohdTypeCode;

    @Column(name = "OHD_AIRLINE", length = 3)
    private String ohdAirline;

    @Column(name = "OHD_FLIGHT_NUMBER", length = 5)
    private String ohdFlightNumber;

    @Column(name = "OHD_SDD")
    private Instant ohdSdd;

    @Column(name = "OHD_FREE_FORM_INFORMATION", length = 59)
    private String ohdFreeFormInformation;

    @Column(name = "STORAGE_POS_X")
    private Long storagePosX;

    @Column(name = "STORAGE_POS_Y")
    private Long storagePosY;

    @Column(name = "IDENTIFICATION_REASON", length = 61)
    private String identificationReason;

    @Column(name = "IND_PROBLEM_BAG")
    private Long indProblemBag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STL_ID")
    private StorageLocation odbStorageLocations;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BSE_ID")
    private BagSource odbBagSources;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PAE_ID")
    private Package odbPackages;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HAA_ID")
    private HandlingArea odbHandlingAreas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HLR_ID")
    private Handler odbHandlers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ULD_ID_LOADED")
    private Uld odbUlds;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ULD_ID_STORED")
    private Uld odbUlds1;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    @Column(name = "CHECKED_WEIGHT", length = 4)
    private String checkedWeight;

    @Column(name = "BAG_INFO_MESSAGE_ID", length = 8)
    private String bagInfoMessageId;

    @Column(name = "SECONDARY_CODE", length = 1)
    private String secondaryCode;

    @Column(name = "PROCESSING_DATE_TIME")
    private Instant processingDateTime;

    @Column(name = "READING_LOCATION", length = 8)
    private String readingLocation;

    @OneToMany(mappedBy = "odbBagData")
    private Set<PhysicalBag> odbPhysicalBags = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbBagDatas")
    private Set<BagDataException> odbBagDataExceptions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbBagDatas")
    private Set<BagDataScreeningInfo> odbBagDataScreeningInfos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "bagData")
    private Set<BaggageTag> odbBaggageTags = new LinkedHashSet<>();

    public Set<BaggageTag> getOdbBaggageTags() {
        return odbBaggageTags;
    }

    public void setOdbBaggageTags(Set<BaggageTag> odbBaggageTags) {
        this.odbBaggageTags = odbBaggageTags;
    }

    public Set<BagDataScreeningInfo> getOdbBagDataScreeningInfos() {
        return odbBagDataScreeningInfos;
    }

    public void setOdbBagDataScreeningInfos(Set<BagDataScreeningInfo> odbBagDataScreeningInfos) {
        this.odbBagDataScreeningInfos = odbBagDataScreeningInfos;
    }

    public Set<BagDataException> getOdbBagDataExceptions() {
        return odbBagDataExceptions;
    }

    public void setOdbBagDataExceptions(Set<BagDataException> odbBagDataExceptions) {
        this.odbBagDataExceptions = odbBagDataExceptions;
    }

    public Set<PhysicalBag> getOdbPhysicalBags() {
        return odbPhysicalBags;
    }

    public void setOdbPhysicalBags(Set<PhysicalBag> odbPhysicalBags) {
        this.odbPhysicalBags = odbPhysicalBags;
    }

    public String getReadingLocation() {
        return readingLocation;
    }

    public void setReadingLocation(String readingLocation) {
        this.readingLocation = readingLocation;
    }

    public Instant getProcessingDateTime() {
        return processingDateTime;
    }

    public void setProcessingDateTime(Instant processingDateTime) {
        this.processingDateTime = processingDateTime;
    }

    public String getSecondaryCode() {
        return secondaryCode;
    }

    public void setSecondaryCode(String secondaryCode) {
        this.secondaryCode = secondaryCode;
    }

    public String getBagInfoMessageId() {
        return bagInfoMessageId;
    }

    public void setBagInfoMessageId(String bagInfoMessageId) {
        this.bagInfoMessageId = bagInfoMessageId;
    }

    public String getCheckedWeight() {
        return checkedWeight;
    }

    public void setCheckedWeight(String checkedWeight) {
        this.checkedWeight = checkedWeight;
    }

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public Uld getOdbUlds1() {
        return odbUlds1;
    }

    public void setOdbUlds1(Uld odbUlds1) {
        this.odbUlds1 = odbUlds1;
    }

    public Uld getOdbUlds() {
        return odbUlds;
    }

    public void setOdbUlds(Uld odbUlds) {
        this.odbUlds = odbUlds;
    }

    public Handler getOdbHandlers() {
        return odbHandlers;
    }

    public void setOdbHandlers(Handler odbHandlers) {
        this.odbHandlers = odbHandlers;
    }

    public HandlingArea getOdbHandlingAreas() {
        return odbHandlingAreas;
    }

    public void setOdbHandlingAreas(HandlingArea odbHandlingAreas) {
        this.odbHandlingAreas = odbHandlingAreas;
    }

    public Package getOdbPackages() {
        return odbPackages;
    }

    public void setOdbPackages(Package odbPackages) {
        this.odbPackages = odbPackages;
    }

    public BagSource getOdbBagSources() {
        return odbBagSources;
    }

    public void setOdbBagSources(BagSource odbBagSources) {
        this.odbBagSources = odbBagSources;
    }

    public StorageLocation getOdbStorageLocations() {
        return odbStorageLocations;
    }

    public void setOdbStorageLocations(StorageLocation odbStorageLocations) {
        this.odbStorageLocations = odbStorageLocations;
    }

    public Long getIndProblemBag() {
        return indProblemBag;
    }

    public void setIndProblemBag(Long indProblemBag) {
        this.indProblemBag = indProblemBag;
    }

    public String getIdentificationReason() {
        return identificationReason;
    }

    public void setIdentificationReason(String identificationReason) {
        this.identificationReason = identificationReason;
    }

    public Long getStoragePosY() {
        return storagePosY;
    }

    public void setStoragePosY(Long storagePosY) {
        this.storagePosY = storagePosY;
    }

    public Long getStoragePosX() {
        return storagePosX;
    }

    public void setStoragePosX(Long storagePosX) {
        this.storagePosX = storagePosX;
    }

    public String getOhdFreeFormInformation() {
        return ohdFreeFormInformation;
    }

    public void setOhdFreeFormInformation(String ohdFreeFormInformation) {
        this.ohdFreeFormInformation = ohdFreeFormInformation;
    }

    public Instant getOhdSdd() {
        return ohdSdd;
    }

    public void setOhdSdd(Instant ohdSdd) {
        this.ohdSdd = ohdSdd;
    }

    public String getOhdFlightNumber() {
        return ohdFlightNumber;
    }

    public void setOhdFlightNumber(String ohdFlightNumber) {
        this.ohdFlightNumber = ohdFlightNumber;
    }

    public String getOhdAirline() {
        return ohdAirline;
    }

    public void setOhdAirline(String ohdAirline) {
        this.ohdAirline = ohdAirline;
    }

    public String getOhdTypeCode() {
        return ohdTypeCode;
    }

    public void setOhdTypeCode(String ohdTypeCode) {
        this.ohdTypeCode = ohdTypeCode;
    }

    public String getOhdRouting5() {
        return ohdRouting5;
    }

    public void setOhdRouting5(String ohdRouting5) {
        this.ohdRouting5 = ohdRouting5;
    }

    public String getOhdRouting4() {
        return ohdRouting4;
    }

    public void setOhdRouting4(String ohdRouting4) {
        this.ohdRouting4 = ohdRouting4;
    }

    public String getOhdRouting3() {
        return ohdRouting3;
    }

    public void setOhdRouting3(String ohdRouting3) {
        this.ohdRouting3 = ohdRouting3;
    }

    public String getOhdRouting2() {
        return ohdRouting2;
    }

    public void setOhdRouting2(String ohdRouting2) {
        this.ohdRouting2 = ohdRouting2;
    }

    public String getOhdRouting1() {
        return ohdRouting1;
    }

    public void setOhdRouting1(String ohdRouting1) {
        this.ohdRouting1 = ohdRouting1;
    }

    public String getOhdPassengerSurname3() {
        return ohdPassengerSurname3;
    }

    public void setOhdPassengerSurname3(String ohdPassengerSurname3) {
        this.ohdPassengerSurname3 = ohdPassengerSurname3;
    }

    public String getOhdPassengerSurname2() {
        return ohdPassengerSurname2;
    }

    public void setOhdPassengerSurname2(String ohdPassengerSurname2) {
        this.ohdPassengerSurname2 = ohdPassengerSurname2;
    }

    public String getOhdPassengerSurname1() {
        return ohdPassengerSurname1;
    }

    public void setOhdPassengerSurname1(String ohdPassengerSurname1) {
        this.ohdPassengerSurname1 = ohdPassengerSurname1;
    }

    public String getOhdPassengerGivenName3() {
        return ohdPassengerGivenName3;
    }

    public void setOhdPassengerGivenName3(String ohdPassengerGivenName3) {
        this.ohdPassengerGivenName3 = ohdPassengerGivenName3;
    }

    public String getOhdPassengerGivenName2() {
        return ohdPassengerGivenName2;
    }

    public void setOhdPassengerGivenName2(String ohdPassengerGivenName2) {
        this.ohdPassengerGivenName2 = ohdPassengerGivenName2;
    }

    public String getOhdPassengerGivenName1() {
        return ohdPassengerGivenName1;
    }

    public void setOhdPassengerGivenName1(String ohdPassengerGivenName1) {
        this.ohdPassengerGivenName1 = ohdPassengerGivenName1;
    }

    public String getOhdPassengerAddress() {
        return ohdPassengerAddress;
    }

    public void setOhdPassengerAddress(String ohdPassengerAddress) {
        this.ohdPassengerAddress = ohdPassengerAddress;
    }

    public String getOhdMaterial() {
        return ohdMaterial;
    }

    public void setOhdMaterial(String ohdMaterial) {
        this.ohdMaterial = ohdMaterial;
    }

    public String getOhdLpn() {
        return ohdLpn;
    }

    public void setOhdLpn(String ohdLpn) {
        this.ohdLpn = ohdLpn;
    }

    public String getOhdFrequentTravellerTier() {
        return ohdFrequentTravellerTier;
    }

    public void setOhdFrequentTravellerTier(String ohdFrequentTravellerTier) {
        this.ohdFrequentTravellerTier = ohdFrequentTravellerTier;
    }

    public String getOhdFrequentTravellerNumber() {
        return ohdFrequentTravellerNumber;
    }

    public void setOhdFrequentTravellerNumber(String ohdFrequentTravellerNumber) {
        this.ohdFrequentTravellerNumber = ohdFrequentTravellerNumber;
    }

    public String getOhdColour() {
        return ohdColour;
    }

    public void setOhdColour(String ohdColour) {
        this.ohdColour = ohdColour;
    }

    public String getOhdBrandName() {
        return ohdBrandName;
    }

    public void setOhdBrandName(String ohdBrandName) {
        this.ohdBrandName = ohdBrandName;
    }

    public Long getIndSystemAtl() {
        return indSystemAtl;
    }

    public void setIndSystemAtl(Long indSystemAtl) {
        this.indSystemAtl = indSystemAtl;
    }

    public String getPhysicalClass() {
        return physicalClass;
    }

    public void setPhysicalClass(String physicalClass) {
        this.physicalClass = physicalClass;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getTimeliness() {
        return timeliness;
    }

    public void setTimeliness(String timeliness) {
        this.timeliness = timeliness;
    }

    public String getLastOperationalCtrlMsg() {
        return lastOperationalCtrlMsg;
    }

    public void setLastOperationalCtrlMsg(String lastOperationalCtrlMsg) {
        this.lastOperationalCtrlMsg = lastOperationalCtrlMsg;
    }

    public String getOperationalControlAction() {
        return operationalControlAction;
    }

    public void setOperationalControlAction(String operationalControlAction) {
        this.operationalControlAction = operationalControlAction;
    }

    public String getQualificationState() {
        return qualificationState;
    }

    public void setQualificationState(String qualificationState) {
        this.qualificationState = qualificationState;
    }

    public String getManualIdTask() {
        return manualIdTask;
    }

    public void setManualIdTask(String manualIdTask) {
        this.manualIdTask = manualIdTask;
    }

    public String getIdentificationState() {
        return identificationState;
    }

    public void setIdentificationState(String identificationState) {
        this.identificationState = identificationState;
    }

    public String getRecognitionState() {
        return recognitionState;
    }

    public void setRecognitionState(String recognitionState) {
        this.recognitionState = recognitionState;
    }

    public String getInternalAirlineData() {
        return internalAirlineData;
    }

    public void setInternalAirlineData(String internalAirlineData) {
        this.internalAirlineData = internalAirlineData;
    }

    public String getPnrAddress() {
        return pnrAddress;
    }

    public void setPnrAddress(String pnrAddress) {
        this.pnrAddress = pnrAddress;
    }

    public String getCorporateOrGroupname() {
        return corporateOrGroupname;
    }

    public void setCorporateOrGroupname(String corporateOrGroupname) {
        this.corporateOrGroupname = corporateOrGroupname;
    }

    public String getFrequentTravellerTier() {
        return frequentTravellerTier;
    }

    public void setFrequentTravellerTier(String frequentTravellerTier) {
        this.frequentTravellerTier = frequentTravellerTier;
    }

    public String getFrequentTravellerNumber() {
        return frequentTravellerNumber;
    }

    public void setFrequentTravellerNumber(String frequentTravellerNumber) {
        this.frequentTravellerNumber = frequentTravellerNumber;
    }

    public String getPassengerNoSurname() {
        return passengerNoSurname;
    }

    public void setPassengerNoSurname(String passengerNoSurname) {
        this.passengerNoSurname = passengerNoSurname;
    }

    public String getPassengerGivenName() {
        return passengerGivenName;
    }

    public void setPassengerGivenName(String passengerGivenName) {
        this.passengerGivenName = passengerGivenName;
    }

    public String getPassengerSurname() {
        return passengerSurname;
    }

    public void setPassengerSurname(String passengerSurname) {
        this.passengerSurname = passengerSurname;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getFlightHandlingArea() {
        return flightHandlingArea;
    }

    public void setFlightHandlingArea(String flightHandlingArea) {
        this.flightHandlingArea = flightHandlingArea;
    }

    public String getBaggageStatus() {
        return baggageStatus;
    }

    public void setBaggageStatus(String baggageStatus) {
        this.baggageStatus = baggageStatus;
    }

    public String getCheckinSequenceNumber() {
        return checkinSequenceNumber;
    }

    public void setCheckinSequenceNumber(String checkinSequenceNumber) {
        this.checkinSequenceNumber = checkinSequenceNumber;
    }

    public String getPassengerStatus() {
        return passengerStatus;
    }

    public void setPassengerStatus(String passengerStatus) {
        this.passengerStatus = passengerStatus;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Long getIndCrew() {
        return indCrew;
    }

    public void setIndCrew(Long indCrew) {
        this.indCrew = indCrew;
    }

    public Long getIndAtl() {
        return indAtl;
    }

    public void setIndAtl(Long indAtl) {
        this.indAtl = indAtl;
    }

    public String getOnwardAirport() {
        return onwardAirport;
    }

    public void setOnwardAirport(String onwardAirport) {
        this.onwardAirport = onwardAirport;
    }

    public String getOnwardClass() {
        return onwardClass;
    }

    public void setOnwardClass(String onwardClass) {
        this.onwardClass = onwardClass;
    }

    public Instant getOnwardSdd() {
        return onwardSdd;
    }

    public void setOnwardSdd(Instant onwardSdd) {
        this.onwardSdd = onwardSdd;
    }

    public String getOnwardFlightNumber() {
        return onwardFlightNumber;
    }

    public void setOnwardFlightNumber(String onwardFlightNumber) {
        this.onwardFlightNumber = onwardFlightNumber;
    }

    public String getOnwardAirline() {
        return onwardAirline;
    }

    public void setOnwardAirline(String onwardAirline) {
        this.onwardAirline = onwardAirline;
    }

    public String getOutboundFlightAirport() {
        return outboundFlightAirport;
    }

    public void setOutboundFlightAirport(String outboundFlightAirport) {
        this.outboundFlightAirport = outboundFlightAirport;
    }

    public String getOutboundFlightClass() {
        return outboundFlightClass;
    }

    public void setOutboundFlightClass(String outboundFlightClass) {
        this.outboundFlightClass = outboundFlightClass;
    }

    public Instant getOutboundFlightSdd() {
        return outboundFlightSdd;
    }

    public void setOutboundFlightSdd(Instant outboundFlightSdd) {
        this.outboundFlightSdd = outboundFlightSdd;
    }

    public String getOutboundFlightNumber() {
        return outboundFlightNumber;
    }

    public void setOutboundFlightNumber(String outboundFlightNumber) {
        this.outboundFlightNumber = outboundFlightNumber;
    }

    public String getOutboundFlightAirline() {
        return outboundFlightAirline;
    }

    public void setOutboundFlightAirline(String outboundFlightAirline) {
        this.outboundFlightAirline = outboundFlightAirline;
    }

    public String getInboundFlightAirport() {
        return inboundFlightAirport;
    }

    public void setInboundFlightAirport(String inboundFlightAirport) {
        this.inboundFlightAirport = inboundFlightAirport;
    }

    public String getInboundFlightClass() {
        return inboundFlightClass;
    }

    public void setInboundFlightClass(String inboundFlightClass) {
        this.inboundFlightClass = inboundFlightClass;
    }

    public Instant getInboundFlightSda() {
        return inboundFlightSda;
    }

    public void setInboundFlightSda(Instant inboundFlightSda) {
        this.inboundFlightSda = inboundFlightSda;
    }

    public Instant getInboundFlightSdd() {
        return inboundFlightSdd;
    }

    public void setInboundFlightSdd(Instant inboundFlightSdd) {
        this.inboundFlightSdd = inboundFlightSdd;
    }

    public String getInboundFlightNumber() {
        return inboundFlightNumber;
    }

    public void setInboundFlightNumber(String inboundFlightNumber) {
        this.inboundFlightNumber = inboundFlightNumber;
    }

    public String getInboundFlightAirline() {
        return inboundFlightAirline;
    }

    public void setInboundFlightAirline(String inboundFlightAirline) {
        this.inboundFlightAirline = inboundFlightAirline;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}