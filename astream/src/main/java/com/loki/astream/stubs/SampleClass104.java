package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass104 {

    @Ignore    private SampleClass105 sampleClass;

    public SampleClass104(){
        sampleClass = new SampleClass105();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}