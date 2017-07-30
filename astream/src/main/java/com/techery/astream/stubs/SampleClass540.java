package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass540 {

    @Ignore    private SampleClass541 sampleClass;

    public SampleClass540(){
        sampleClass = new SampleClass541();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}