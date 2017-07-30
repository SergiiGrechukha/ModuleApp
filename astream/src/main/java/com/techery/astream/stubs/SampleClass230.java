package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass230 {

    @Ignore    private SampleClass231 sampleClass;

    public SampleClass230(){
        sampleClass = new SampleClass231();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}