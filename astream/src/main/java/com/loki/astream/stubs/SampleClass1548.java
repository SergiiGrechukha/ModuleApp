package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1548 {

    @Ignore    private SampleClass1549 sampleClass;

    public SampleClass1548(){
        sampleClass = new SampleClass1549();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}