package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass907 {

    @Ignore    private SampleClass908 sampleClass;

    public SampleClass907(){
        sampleClass = new SampleClass908();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}