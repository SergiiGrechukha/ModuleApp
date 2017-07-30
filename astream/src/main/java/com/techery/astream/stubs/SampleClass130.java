package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass130 {

    @Ignore    private SampleClass131 sampleClass;

    public SampleClass130(){
        sampleClass = new SampleClass131();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}