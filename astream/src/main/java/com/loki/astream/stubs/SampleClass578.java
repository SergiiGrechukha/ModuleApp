package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass578 {

    @Ignore    private SampleClass579 sampleClass;

    public SampleClass578(){
        sampleClass = new SampleClass579();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}