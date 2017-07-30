package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass926 {

    @Ignore    private SampleClass927 sampleClass;

    public SampleClass926(){
        sampleClass = new SampleClass927();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}