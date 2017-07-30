package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass670 {

    @Ignore    private SampleClass671 sampleClass;

    public SampleClass670(){
        sampleClass = new SampleClass671();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}