package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1515 {

    @Ignore    private SampleClass1516 sampleClass;

    public SampleClass1515(){
        sampleClass = new SampleClass1516();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}