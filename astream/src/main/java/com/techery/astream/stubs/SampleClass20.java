package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass20 {

    @Ignore    private SampleClass21 sampleClass;

    public SampleClass20(){
        sampleClass = new SampleClass21();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}