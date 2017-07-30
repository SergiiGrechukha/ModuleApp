package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass795 {

    @Ignore    private SampleClass796 sampleClass;

    public SampleClass795(){
        sampleClass = new SampleClass796();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}