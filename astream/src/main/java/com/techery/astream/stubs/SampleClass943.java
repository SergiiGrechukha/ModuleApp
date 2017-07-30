package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass943 {

    @Ignore    private SampleClass944 sampleClass;

    public SampleClass943(){
        sampleClass = new SampleClass944();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}