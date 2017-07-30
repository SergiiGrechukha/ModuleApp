package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass265 {

    @Ignore    private SampleClass266 sampleClass;

    public SampleClass265(){
        sampleClass = new SampleClass266();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}