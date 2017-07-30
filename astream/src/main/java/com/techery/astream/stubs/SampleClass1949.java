package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1949 {

    @Ignore    private SampleClass1950 sampleClass;

    public SampleClass1949(){
        sampleClass = new SampleClass1950();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}