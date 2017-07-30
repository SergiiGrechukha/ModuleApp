package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1739 {

    @Ignore    private SampleClass1740 sampleClass;

    public SampleClass1739(){
        sampleClass = new SampleClass1740();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}