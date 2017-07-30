package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass832 {

    @Ignore    private SampleClass833 sampleClass;

    public SampleClass832(){
        sampleClass = new SampleClass833();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}