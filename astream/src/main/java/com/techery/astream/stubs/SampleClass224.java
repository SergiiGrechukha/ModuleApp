package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass224 {

    @Ignore    private SampleClass225 sampleClass;

    public SampleClass224(){
        sampleClass = new SampleClass225();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}