package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass772 {

    @Ignore    private SampleClass773 sampleClass;

    public SampleClass772(){
        sampleClass = new SampleClass773();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}