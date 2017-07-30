package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass974 {

    @Ignore    private SampleClass975 sampleClass;

    public SampleClass974(){
        sampleClass = new SampleClass975();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}