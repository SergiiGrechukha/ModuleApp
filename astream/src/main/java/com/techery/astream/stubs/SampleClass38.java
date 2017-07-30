package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass38 {

    @Ignore    private SampleClass39 sampleClass;

    public SampleClass38(){
        sampleClass = new SampleClass39();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}