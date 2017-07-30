package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1439 {

    @Ignore    private SampleClass1440 sampleClass;

    public SampleClass1439(){
        sampleClass = new SampleClass1440();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}