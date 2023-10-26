package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import assignments.annotations.FullNameProcessorGeneratorAnnotation;
import assignments.annotations.ListIteratorAnnotation;
import assignments.annotations.ReadFullProcessorNameAnnotation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocalProcessor {
    private String processorName;
    private Long period = 10_000_000_000_000L;
    private String processorVersion;
    private Integer valueOfCheap;
    private Scanner informationScanner;
    private List<String> stringArrayList = new LinkedList<>();
    private StringBuilder stringBuilder;

    public LocalProcessor(String processorName, Long period, String processorVersion, Integer valueOfCheap,
                          Scanner informationScanner, List<String> stringArrayList) {
        this.processorName = processorName;
        this.period = period;
        this.processorVersion = processorVersion;
        this.valueOfCheap = valueOfCheap;
        this.informationScanner = informationScanner;
        this.stringArrayList = stringArrayList;
    }

    public LocalProcessor() {
    }

    @ListIteratorAnnotation
    public void listIterate(List<String> stringList) {
        for (String str : stringList){
           if (str != null){
                System.out.println(str.hashCode());
            }
        }
    }

    @FullNameProcessorGeneratorAnnotation
    public String fullNameProcessorGenerate(List<String> stringList) {
        stringBuilder = new StringBuilder();
        for (String str : stringList){
           stringBuilder.append(str).append(" ");
        }
        return stringBuilder.toString();
    }

    @ReadFullProcessorNameAnnotation
    public void readFullProcessorName(File file) throws FileNotFoundException {
            stringBuilder = new StringBuilder();
            informationScanner = new Scanner(file);
            while (informationScanner.hasNext()) {
                stringBuilder.append(informationScanner.nextLine());
            }
            processorVersion = stringBuilder.toString();
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public void setPeriod(Long period) {
        this.period = period;
    }

    public void setProcessorVersion(String processorVersion) {
        this.processorVersion = processorVersion;
    }

    public void setValueOfCheap(Integer valueOfCheap) {
        this.valueOfCheap = valueOfCheap;
    }

    public void setInformationScanner(Scanner informationScanner) {
        this.informationScanner = informationScanner;
    }

    public void setStringArrayList(List<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }

}
