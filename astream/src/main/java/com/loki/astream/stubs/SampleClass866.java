package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass866 {

    @Ignore    private SampleClass867 sampleClass;

    public SampleClass866(){
        sampleClass = new SampleClass867();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}