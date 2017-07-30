package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass992 {

    @Ignore    private SampleClass993 sampleClass;

    public SampleClass992(){
        sampleClass = new SampleClass993();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}