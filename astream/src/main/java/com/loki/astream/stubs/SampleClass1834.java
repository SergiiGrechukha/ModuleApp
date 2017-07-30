package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1834 {

    @Ignore    private SampleClass1835 sampleClass;

    public SampleClass1834(){
        sampleClass = new SampleClass1835();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}