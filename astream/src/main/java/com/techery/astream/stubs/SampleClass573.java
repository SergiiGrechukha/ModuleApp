package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass573 {

    @Ignore    private SampleClass574 sampleClass;

    public SampleClass573(){
        sampleClass = new SampleClass574();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}