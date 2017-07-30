package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1066 {

    @Ignore    private SampleClass1067 sampleClass;

    public SampleClass1066(){
        sampleClass = new SampleClass1067();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}