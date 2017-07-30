package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass28 {

    @Ignore    private SampleClass29 sampleClass;

    public SampleClass28(){
        sampleClass = new SampleClass29();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}