package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass649 {

    @Ignore    private SampleClass650 sampleClass;

    public SampleClass649(){
        sampleClass = new SampleClass650();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}