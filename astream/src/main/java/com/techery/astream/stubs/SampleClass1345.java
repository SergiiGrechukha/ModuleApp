package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1345 {

    @Ignore    private SampleClass1346 sampleClass;

    public SampleClass1345(){
        sampleClass = new SampleClass1346();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}