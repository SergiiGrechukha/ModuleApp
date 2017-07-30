package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass497 {

    @Ignore    private SampleClass498 sampleClass;

    public SampleClass497(){
        sampleClass = new SampleClass498();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}