package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass639 {

    @Ignore    private SampleClass640 sampleClass;

    public SampleClass639(){
        sampleClass = new SampleClass640();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}