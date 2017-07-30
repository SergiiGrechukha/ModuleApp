package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1615 {

    @Ignore    private SampleClass1616 sampleClass;

    public SampleClass1615(){
        sampleClass = new SampleClass1616();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}