package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1714 {

    @Ignore    private SampleClass1715 sampleClass;

    public SampleClass1714(){
        sampleClass = new SampleClass1715();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}