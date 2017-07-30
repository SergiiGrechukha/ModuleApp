package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1572 {

    @Ignore    private SampleClass1573 sampleClass;

    public SampleClass1572(){
        sampleClass = new SampleClass1573();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}