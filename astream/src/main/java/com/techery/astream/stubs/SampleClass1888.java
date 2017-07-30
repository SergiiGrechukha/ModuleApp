package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1888 {

    @Ignore    private SampleClass1889 sampleClass;

    public SampleClass1888(){
        sampleClass = new SampleClass1889();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}