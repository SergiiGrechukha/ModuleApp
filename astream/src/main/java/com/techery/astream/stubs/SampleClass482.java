package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass482 {

    @Ignore    private SampleClass483 sampleClass;

    public SampleClass482(){
        sampleClass = new SampleClass483();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}