package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1781 {

    @Ignore    private SampleClass1782 sampleClass;

    public SampleClass1781(){
        sampleClass = new SampleClass1782();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}