package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass659 {

    @Ignore    private SampleClass660 sampleClass;

    public SampleClass659(){
        sampleClass = new SampleClass660();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}