package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass806 {

    @Ignore    private SampleClass807 sampleClass;

    public SampleClass806(){
        sampleClass = new SampleClass807();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}