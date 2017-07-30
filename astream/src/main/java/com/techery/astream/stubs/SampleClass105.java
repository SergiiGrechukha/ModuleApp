package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass105 {

    @Ignore    private SampleClass106 sampleClass;

    public SampleClass105(){
        sampleClass = new SampleClass106();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}