package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass780 {

    @Ignore    private SampleClass781 sampleClass;

    public SampleClass780(){
        sampleClass = new SampleClass781();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}